import 'package:flutter/material.dart';

void main() {
  runApp(const DoorstepApp());
}

class DoorstepApp extends StatelessWidget {
  const DoorstepApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Doorstep Delivery',
      theme: ThemeData(primarySwatch: Colors.orange),
      home: const HomeScreen(),
    );
  }
}

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Doorstep Delivery'), centerTitle: true),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Icon(Icons.delivery_dining, size: 100, color: Colors.orange),
            const SizedBox(height: 20),
            const Text('Welcome to Doorstep Delivery', style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold)),
            const SizedBox(height: 10),
            const Text('Fast delivery at your doorstep'),
            const SizedBox(height: 30),
            ElevatedButton(onPressed: () {}, child: const Text('Order Now')),
          ],
        ),
      ),
    );
  }
}
