from django.conf.urls import url
from . import views

app_name = 'datum'

urlpatterns = [
    url(r'^$', views.index, name='index'),
    url(r'search/datum', views.search_datum, name='search_datum'),
    url(r'search/form', views.search_form, name='search_form'),
    url(r'^(?P<author_name>[A-z ]+)/$', views.detail, name='detail'),
]