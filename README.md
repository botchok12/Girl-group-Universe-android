# Girlgroup Universe — GitHub-ready Android project

This repository builds a real Android APK using GitHub Actions. The app loads the bundled
Girlgroup Universe HTML locally inside Android WebView; app data is stored on-device.

## One-click APK build

1. Create a GitHub repository (for example `Girlgroup-Universe-Android`).
2. Upload **the contents of this folder** to the repository root (not this ZIP as a ZIP file).
   Make sure `.github/workflows/build-apk.yml` is included.
3. Open the repository's **Actions** tab.
4. Choose **Build Android APK** → **Run workflow** → **Run workflow**.
5. When the run completes successfully, open it and download the
   `Girlgroup-Universe-debug-apk` artifact.
6. Extract the artifact ZIP and install `app-debug.apk` on your Android phone.

A build also runs automatically whenever you push commits to `main` or `master`.

## Notes

- This workflow creates a debug APK for personal testing/installing.
- Android may ask you to allow installation from your browser or file manager.
- This source package is not an APK until GitHub Actions compiles it.
