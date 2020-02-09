# VibeRadar

This app can play the ukulele, so you know it's quirky.

Take a picture of something. The app calculates the vibes based on color composition, and plays you a corresponding song composed of high-quality ukulele samples.

## How it works

This is a combination of the work in [ImagePicker](http://github.com/kevinalford/ImagePicker) and in [vibe-player](http://github.com/jedfras/vibe-player).

The app uses the camera permission to take a picture, makes a `Palette` from the picture taken, and based on the warmth of the image (calculated from RGB values), chooses a path of ukulele recordings to play, as well as the tempo. Using music theory, the app chooses a new and organic sequence of chords every time.

## Inspiration
* ["Claire de Lune" by Harry Kalahiki](https://open.spotify.com/track/5Ms9J0bzaA4GJGM4SSm6q2)

## Contributors

* [Henry Roden](http://github.com/IsNascarASport) - vision and music playing
* [Kevin Alford](http://github.com/KevinAlford) - camera and color stuff
* [Grayson Moyer](http://github.com/Gmoyer11) - advanced music theory
* [Connor Morris](http://github.com/connor3090) - TensorFlow research
* [Jediael Fraser](http://github.com/jedfras) - ukulele stylings and putting it together
* [Brandon Rowand](http://www.twitter.com/wildenian_thot) - vibes
