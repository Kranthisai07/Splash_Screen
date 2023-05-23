import 'package:flutter/material.dart'
import 'package:flutter/services.dart'
import 'package:your_app/screens/home_screen.dart'

// Replace with your home screen file

void main() {
    runApp(MyApp());
}

class MyApp extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
        SystemChrome.setEnabledSystemUIOverlays([]);

        return MaterialApp(
            debugShowCheckedModeBanner: false,
        home: SplashScreen(),
        );
    }
}

class SplashScreen extends StatefulWidget {
    @override
    _SplashScreenState createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
    @override
    void initState() {
        super.initState();
        navigateToHomeScreen();
    }

    void navigateToHomeScreen() async {
        await Future.delayed(Duration(seconds: 3)); // Splash screen delay (3 seconds in this case)

        Navigator.pushReplacement(
            context,
            MaterialPageRoute(builder: (context) => HomeScreen()), // Replace with your home screen
        );
    }

    @override
    Widget build(BuildContext context) {
        return Scaffold(
            backgroundColor: Colors.white,
        body: Center(
        child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
        // Add your splash screen logo or image here
        Image.asset(
            'assets/images/logo.png', // Replace with your image path
            width: 150,
        height: 150,
        ),
        SizedBox(height: 24),
        CircularProgressIndicator(), // Loading indicator
        ],
        ),
        ),
        );
    }
}
```

Make sure to replace `'assets/images/logo.png'` with the path to your splash screen image file. You can customize the duration of the splash screen delay by adjusting the `Duration` in `await Future.delayed(Duration(seconds: 3));` line. Additionally, replace `HomeScreen()` with your actual home screen widget.

Remember to add the necessary assets and update the `pubspec.yaml` file to include the image asset.