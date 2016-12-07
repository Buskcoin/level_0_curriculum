/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Bullseye
 *    Solution
 *    
 *    
 ******************************************************************************/


/**
  don’t need setup or draw methods.
  https://docs.google.com/document/d/1L8F_PKL2rcGx2d-Oi_APoiA6E_tpThDcfDkJfbgwMMc/edit
*/


for (int i = 100; i>0; i-=10) {
  ellipse(50, 50, i, i);
}


/*            OR            */


for (int i = 0; i<100; i+=10) {
  noFill();
  ellipse(50, 50, i, i);
}

