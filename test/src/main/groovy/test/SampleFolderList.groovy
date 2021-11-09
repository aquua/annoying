package test

class SampleFolderList {

    static void main(String[] args) {

//
        def dir = new File("C:\\Users\\JHPark\\Desktop\\개발")
        dir.eachFile {
            println it.name
        }
    }
}
