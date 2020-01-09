<#-- This is user defined macro -->
<#macro productDetails p isVertical color>
  <div class='inline-box ${isVertical?then("vertical","horizontal")}' style="background:${color}">
    <p style="font-weight: bold;">${p.name}</p>
    <p>${p.url}</p>
    <p>${p.price}</p>
  </div>
</#macro>