class SetStateTest extends StatefulWidget {
  State<SetStateTest> createState() => SetStateTest();
}
class SetStateTest extends State<SetStateTest> {
  String imageUrl = "../../images/test_image.jpg";
  String title = "Hi";
  String description = "Description";
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
                          Text(title),
                          Expanded(child: Image.network(imageUrl)),
                          Text(description),
                        ],
                      ),
                    )],
                ),
              ),
              Expanded(
                child: Column(
                  children: [
                    Expanded(
                      child:Container(
                        height: 200,
                        child: MaterialButton(
                        onPressed:(){
                        setState((){
                            imageUrl = "../../images/test_image2.jpg";
                            title="Test 1";
                            description="This is description for the first photo";
                        });
                         },
                          child: Column(
                            children:  [
                              Text("Test 1"),
                              Expanded(child: Image.network("../../images/test_image2.jpg"))
                            ],
                          ),
                        ),
                      ) ,
                    ) ,
                    Expanded(
                      child:Container(
                        width: 200,

                        height: 200,
                        child: MaterialButton(
                        onPressed:(){
                         setState((){
                          imageUrl = "../../images/test_image3.jpg";
                          title="Test 2";
                          description="This is description for the second photo";
                         });
                        },

                          child: Column(
                            children:  [
                              Text("Test 2"),
                              Expanded(child: Image.network("../../images/test_image3.jpg"))
                            ],
                          ),
                        ),
                      ) ,
                    ) ,
                    Expanded(
                      child:Container(
                        width: 200,

                        height: 200,
                        child: MaterialButton(
                       onPressed:(){
                        setState((){
                          imageUrl = "../../images/test_image.jpg";
                          title = "Test 3";
                          description="This is description for the third photo";
                         });
                        },
                          child: Column(
                            children:  [
                              Text("Test 3"),
                              Expanded(child: Image.network("../../images/test_image.jpg"))
                            ],
                          ),
                        ),
                      ) ,
                    ) ,
                    Expanded(
                      child:Container(
                        width: 200,

                        height: 200,
                        child: MaterialButton(
                        onPressed:(){
                        setState((){
                          imageUrl = "../../images/test_image2.jpg";
                          title = "Test 4";
                          description="This is description for the fourth photo";
                         });
                         },
                          child: Column(
                            children:  [
                              Text("Test 4"),
                              Expanded(child: Image.network("../../images/test_image2.jpg"))
                            ],
                          ),
                        ),
                      ) ,
                    ) ,
                  ],
                ),
              ),
            ],
          ),
      ),
  );
  }

}

