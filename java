#!/bin/bash
green='\033[1;32m'
sc='\033[0m'
blue='\033[0;34m'
clear
read -p "$(echo -e $green"Digite o nome do pacote: "$sc)" package_name
sleep 2s
echo
read -p "$(echo -e $green"Digite o nome da Atividade: "$sc)" activity_name
sleep 2s
echo
read -p "$(echo -e $green"Digite o nome do arquivo .xml: "$sc)" xml_name
sleep 2s
clear
echo "${blue}Gerando arquivo .java...${sc}"
sleep 3s
clear
echo "${blue}Gerado com Sucesso! ${sc}"
echo
echo "Salvo na sua memória interna! "
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
