<#-- This is user defined macro with isVertical defaults to 'false' and color defaults to 'lightgray' -->
<#macro productDetails p isVertical=false color="lightgray">
  <div class='inline-box ${isVertical?then("vertical","horizontal")}' style="background:${color}">
    <p style="font-weight: bold;">${p.name}</p>
    <p>${p.url}</p>
    <p>${p.price}</p>
  </div>
</#macro>