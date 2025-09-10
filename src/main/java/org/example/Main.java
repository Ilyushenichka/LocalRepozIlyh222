package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
         //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println(StringUtils.upperCase("Hello and welcome!"));
            System.out.println(StringUtils.upperCase("Hello, not welcome("));
            System.out.println(StringUtils.upperCase("Hello, maybe welcome, maybe no)"));
    }
}