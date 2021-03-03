import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: SafeArea(
        child: Scaffold(
          appBar: AppBar(
            title: Text("1ST PROGRAM"),
          ),
          body: Column(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Expanded(
                  child: FlatButton(
                    onPressed:(){

                    },
                    child: Text("RAKSHITHA"),
                    color:Colors.red,
                  ),
                ),
                Expanded(
                  child: FlatButton(
                    onPressed:(){

                    },
                    child: Text("RAKSHITHA"),
                    color:Colors.blue,
                  ),
                ),
                Expanded(child: Row(
                    mainAxisAlignment: MainAxisAlignment.end,
                    children: [
                      Expanded(child: Text("ROW WIDGET")
                      )
                    ]
                )
                )

              ]
          ),
        ),
      ),
    );

  }
}