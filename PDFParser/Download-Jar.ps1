$url = "http://apache.osuosl.org/pdfbox/2.0.11/pdfbox-app-2.0.11.jar"
$output = "$HOME\pdfbox-app-2.0.11.jar"
$wc = New-Object System.Net.WebClient
$wc.DownloadFile($url, $output)
