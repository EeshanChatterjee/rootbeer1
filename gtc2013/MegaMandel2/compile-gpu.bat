cd ../../
ant jar
pack-rootbeer.bat

cd gtc2013/MegaMandel2/mandellib
ant jar
cd ../MegaMandel2/
ant jar
cd ..
java -jar ../../Rootbeer.jar mandellib.jar mandellib-GPU.jar
java -jar ../../lib/pack.jar -mainjar MegaMandel2.jar -libjar mandellib-GPU.jar -destjar MegaMandel2-GPU.jar
