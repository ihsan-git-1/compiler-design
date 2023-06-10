class Second extends StatefulWidget {
  State<SecondPage> createState() => SecondState();
}
class SecondState extends State<Second> {

  Widget build(BuildContext context) {
  return Scaffold(
  body: Padding(
        padding: EdgeInsets.all(8),
        child: Row(
            children: [
              Expanded(
                child: Column(
                  children: [
                    Container(
                      height: 300,
                      child: Column(
                        children:  [
                          Text("Hi"),
                          Expanded(child: Image.network("../../images/test_image.jpg"))
                        ],
                      ),
                    )],
                ),
              ),
            ],
          ),
      ),
  );
  }

}