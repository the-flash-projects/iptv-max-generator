#!/bin/bash
clear
read -p "Digite o nome do pacote: " package_name
sleep 2s
echo
read -p "Digite o nome da Atividade: " activity_name
sleep 2s
echo
read -p "Digite o nome do arquivo .xml: " xml_name
sleep 2s
clear
echo "Gerando arquivo .java..."
sleep 3s
clear
echo "Gerado com Sucesso! "
echo
echo "Salvo na sua memória interna!"
echo "package $package_name;" >> ~/$activity_name.java
echo >> ~/$activity_name.java
echo "import android.app.*;" >> $activity_name.java
echo "import android.os.*;" >> $activity_name.java
echo >> $activity_name.java
echo "public class $activity_name extends Activity" >> $activity_name.java
echo "{" >> $activity_name.java
echo "	@Override" >> $activity_name.java
echo "protected void onCreate(Bundle savedInstanceState)" >> $activity_name.java
echo "{" >> $activity_name.java
echo >> $activity_name.java
echo "super.onCreate(savedInstanceState);" >> $activity_name.java
echo "setContentView(R.layout.$xml_name);" >> $activity_name.java
echo "}" >> $activity_name.java
echo "}" >> $activity_name.java
cp $activity_name.java /sdcard
rm -rf $activity_name.java
sleep 4s
clear
curl -sO https://raw.githubusercontent.com/the-flash-projects/iptv-max-generator/main/menu && bash menu
