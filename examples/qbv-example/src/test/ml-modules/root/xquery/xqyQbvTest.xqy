xquery version "1.0-ml";

import module namespace op="http://marklogic.com/optic" at "/MarkLogic/optic.xqy";

op:from-view("HR", "Sales")
  => op:result()