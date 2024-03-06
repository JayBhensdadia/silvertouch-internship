import re

def is_valid_url(url):
    
    url_pattern = re.compile(
        r'^(?:http|https):\/\/'  
        r'(?:[\w.-]+)\.(?:[a-z]{2,})'  
        r'(?:\/[^\s]*)?$'  
    )

    
    if url_pattern.match(url):
        return True
    else:
        return False


urls = [
    "http://example.com",
    "https://www.example.com",
    "http://subdomain.example.com/path",
    "http://123.45.67.89",
    "https://example.com:8080/path",
    "ftp://example.com",
    "example.com",
    "http://",
    "http://example",
    "http://example.",
    "http://.com",
]

for url in urls:
    print(f"{url}: {is_valid_url(url)}")
