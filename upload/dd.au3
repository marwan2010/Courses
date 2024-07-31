#include <IE.au3>
#include <Array.au3>
$x=$CmdLine[1] ;
ControlFocus("Open","","ComboBox1")
Sleep(3000)
ControlSetText("Open","","Edit1",$x)
ControlClick("Open","","Button1")