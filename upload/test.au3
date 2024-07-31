ControlFocus("Open","","ComboBox1")
Sleep(3000)
ControlSetText("Open","","Edit1",$CmdLine[1]);
ControlClick("Open","","Button1")
