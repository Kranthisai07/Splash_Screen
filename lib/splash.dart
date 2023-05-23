import 'package:flutter/material.dart';

import 'main.dart';

class Splash  extends StatefulWidget {
  const Splash({Key? key}) : super(key: key);

  @override
  State<Splash> createState() => _SplashState();
}

class _SplashState extends State<Splash> {
  @override
  void initState() {
    super.initState();
    //_navigatetohome();
  }


  _navigatetohome()async{
    await Future.delayed(Duration(microseconds: 1500),() {});
    Navigator.pushReplacement(context, MaterialPageRoute(builder: (context)=>MyHomePage( title: 'GADI' ,)));
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center ,
          children: [
            Container(
              height:100,
              width: 100,
              color: Colors.black,
            ),
            Container(
              child: Text(
                  'Splash Screen',
                  style: TextStyle(fontSize: 26, fontWeight: FontWeight.bold),
              ),
            ),
          ],
        ),
      ),
    );
  }
}

