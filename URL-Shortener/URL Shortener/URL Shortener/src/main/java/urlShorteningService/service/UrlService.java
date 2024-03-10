package urlShorteningService.service;

import org.springframework.stereotype.Service;

import urlShorteningService.model.Url;
import urlShorteningService.model.UrlDto;

@Service
public interface UrlService
{
    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public  void  deleteShortLink(Url url);
}
