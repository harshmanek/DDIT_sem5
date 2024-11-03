import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Image App',
      home: ImageSwitcher(),
    );
  }
}

class ImageSwitcher extends StatefulWidget {
  @override
  _ImageSwitcherState createState() => _ImageSwitcherState();
}

class _ImageSwitcherState extends State<ImageSwitcher> {
  int _currentImageIndex = 0;

  final List<String> _images = [
    'assets/image1.jpg',
    'assets/image2.jpg',
  ];

  void _switchImage() {
    setState(() {
      _currentImageIndex = (_currentImageIndex + 1) % _images.length;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Image Switcher'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Image.asset(_images[_currentImageIndex]),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: _switchImage,
              child: Text('Switch Image'),
            ),
          ],
        ),
      ),
    );
  }
}