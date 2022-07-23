<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="tr">
<head>
    <script type="text/javascript" src="<c:url value='js/myscript.js'/>"></script>
    <meta charset="UTF-8">

    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <script>
        function multiplicationtime(){
            s1=parseInt(document.getElementById("tarac").value);
            s2=parseInt(document.getElementById("aracbasidk").value);
            document.getElementById("tsure").value= s1*s2;

        }
        function selectvalue() {
            var checked = document.querySelectorAll('#choosesase :checked');
            var selected = [...checked].map(option => option.value);
            document.getElementById("tarac").value = selected.length;
        }
        function adaptasyonEnable(){
            var choosetesisat = document.getElementById("choosetesisat");
            var selectedValue = choosetesisat.options[choosetesisat.selectedIndex].value;
            if(selectedValue=="YOK"){
                document.getElementById("adaptasyonno").disabled=false;
            }
            else {document.getElementById("adaptasyonno").disabled=true;}
        }

    </script>
</head>
<body>
<div align="center">
    <form:form method="POST"  action="/registerform" modelAttribute="registry" >

        <table>

          <tr>
                <td><form:label path="kayitTipi">Kayıt Tipi*</form:label></td>
                <td><form:select path="kayitTipi">
                    <form:option value="NONE"/>
                    <form:options id="choosekayit" items="${kayitList}" />
                </form:select>

                </td>
            </tr>
            <tr>
                <td><form:label path="bildirenBolum">Bildiren Bölüm*</form:label></td>
                <td><form:select path="bildirenBolum"  >
                    <form:options id="choosebildiren" items="${bildirenBolumList}" />
                </form:select>

                </td>
            </tr>

            <tr>
                <td><form:label path="ldSorumlusu">LD Sorumlusu*</form:label> </td>
                <td><form:select  path="ldSorumlusu" >
                    <form:option value="NONE"/>
                        <form:options id="chooseldsorumlusu" items="${ldSorumlusuList}"/>
                    </form:select>
      </td>
            </tr>
            <tr>
                <td><form:label path="aciklama">Açıklama*</form:label></td>
                <td><form:textarea path="aciklama" rows="5" cols="20"/> </td>
            </tr>
            <tr>
                <td><form:label path="saseNo" >Şase Numarası*</form:label></td>
                <td><form:select onchange="selectvalue()" id="choosesase" path="saseNo" multiple="true">
                    <form:options  items="${saseNoList}" />
                </form:select> </td>
            </tr>

            <tr>
                <td><form:label path="taracSayi">Toplam Araç Sayısı*</form:label></td>
                <td><form:input id="tarac" path="taracSayi"  disabled="true"/></td>
            </tr>
            <tr>
                <td><form:label path="parcaNo">Parça No</form:label></td>
                <td><form:input type="text" id="parcano" path="parcaNo" rows="1" cols="20"/> </td>
            </tr>
            <tr>
                <td><form:label path="tesisatNo">Tesisat Numarası</form:label> </td>
                <td><form:select onchange="adaptasyonEnable()"  path="tesisatNo" id="choosetesisat">
                    <form:option value="NONE" label="check"/>
                        <form:option  value="YOK" label="YOK"/>


                    </form:select></td>
            </tr>

            <tr>
                <td>
                    <form:label path="adaptasyonNo">Adaptasyon Tanımı/No</form:label> </td>
                <td> <form:input type="text"  id="adaptasyonno" path="adaptasyonNo" disabled="true" /></td>
            </tr>
            <tr>
                <td>
                    <form:label path="aracbasiSure">Araç Başı İşçilik Süresi(dk)*</form:label> </td>
                <td><form:input onkeyup="multiplicationtime()" id="aracbasidk" path="aracbasiSure"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="tSure">Toplam İşçilik Süresi*</form:label></td>
                <td><form:input id="tsure" path="tSure" /></td>

            </tr>
            <tr>
                <td><form:label path="mesai">Fazla mesai yapıldı mı?</form:label></td>
                <td><form:select id="choosemesai" path="mesai">
                    <form:options  id="choosemesai" items="${mesaiList}"/>
                </form:select></td>

            </tr>
            <tr>
                <td><form:input value="gönder" label="Gönder" path="" type="submit"/></td>
            </tr>

            <tr>
               <!-- <td> <input type="submit" id="calculate"> </td>-->
            </tr>



        </table>



    </form:form>
</div>



</body>

</html>