.class final Lbfr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbfq;


# instance fields
.field private final a:Landroid/net/http/AndroidHttpClient;

.field private final b:I

.field private final c:I

.field private d:Landroid/net/Uri;

.field private e:I

.field private f:Lorg/apache/http/client/methods/HttpRequestBase;

.field private final g:Ljava/util/HashMap;

.field private h:Lbfc;

.field private i:[Lorg/apache/http/Header;

.field private final j:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 52
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 53
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    return-void
.end method

.method public constructor <init>(Landroid/net/http/AndroidHttpClient;II)V
    .locals 3

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lbfr;->a:Landroid/net/http/AndroidHttpClient;

    .line 74
    iput p2, p0, Lbfr;->b:I

    .line 75
    iput p3, p0, Lbfr;->c:I

    .line 76
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbfr;->g:Ljava/util/HashMap;

    .line 77
    new-instance v0, Lblp;

    const-string v1, "SimpleHttpRequestImpl"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbfr;->j:Lblp;

    .line 78
    return-void
.end method

.method private a(Lorg/apache/http/client/methods/HttpRequestBase;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 155
    iput-object p1, p0, Lbfr;->f:Lorg/apache/http/client/methods/HttpRequestBase;

    .line 156
    iget-object v0, p0, Lbfr;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 157
    iget-object v5, p0, Lbfr;->f:Lorg/apache/http/client/methods/HttpRequestBase;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v1, v0}, Lorg/apache/http/client/methods/HttpRequestBase;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 159
    :cond_0
    new-instance v4, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v4}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    .line 160
    iget-object v0, p0, Lbfr;->a:Landroid/net/http/AndroidHttpClient;

    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    iget v1, p0, Lbfr;->b:I

    invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 161
    iget-object v0, p0, Lbfr;->a:Landroid/net/http/AndroidHttpClient;

    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    iget v1, p0, Lbfr;->c:I

    invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 164
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move v1, v3

    move-object v0, v2

    .line 172
    :cond_1
    :goto_1
    const/4 v3, 0x5

    if-ge v1, v3, :cond_7

    .line 173
    :try_start_0
    iget-object v0, p0, Lbfr;->a:Landroid/net/http/AndroidHttpClient;

    iget-object v3, p0, Lbfr;->f:Lorg/apache/http/client/methods/HttpRequestBase;

    invoke-virtual {v0, v3, v4}, Landroid/net/http/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 174
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v3

    .line 175
    const/16 v5, 0x12e

    if-eq v3, v5, :cond_2

    const/16 v5, 0x12d

    if-ne v3, v5, :cond_7

    .line 179
    :cond_2
    const-string v3, "Location"

    invoke-interface {v0, v3}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object v3

    .line 180
    if-eqz v3, :cond_7

    array-length v5, v3
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3

    if-eqz v5, :cond_7

    .line 182
    :try_start_1
    iget-object v5, p0, Lbfr;->f:Lorg/apache/http/client/methods/HttpRequestBase;

    new-instance v6, Ljava/net/URI;

    array-length v7, v3

    add-int/lit8 v7, v7, -0x1

    aget-object v3, v3, v7

    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v3}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Lorg/apache/http/client/methods/HttpRequestBase;->setURI(Ljava/net/URI;)V
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3

    .line 190
    add-int/lit8 v1, v1, 0x1

    .line 194
    :try_start_2
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    .line 195
    if-eqz v3, :cond_1

    .line 196
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_2
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_1

    .line 238
    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "client protocol error"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 187
    :catch_1
    move-exception v1

    :try_start_3
    iget-object v1, p0, Lbfr;->j:Lblp;

    const-string v3, "Redirect failed. Unable to parse Location header into an URI"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v5}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v3, v0

    .line 202
    :goto_2
    const-string v0, "http.request"

    .line 203
    invoke-interface {v4, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/client/methods/HttpUriRequest;

    .line 204
    const-string v1, "http.target_host"

    invoke-interface {v4, v1}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/http/HttpHost;

    .line 205
    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/URI;->isAbsolute()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 209
    if-eqz v3, :cond_6

    .line 210
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v0

    iput-object v0, p0, Lbfr;->i:[Lorg/apache/http/Header;

    .line 211
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    .line 215
    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    iput v0, p0, Lbfr;->e:I

    .line 217
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    .line 218
    if-eqz v3, :cond_6

    .line 219
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContentType()Lorg/apache/http/Header;

    move-result-object v0

    .line 220
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 221
    :goto_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 222
    const-string v0, "application/octet-stream"

    move-object v1, v0

    .line 224
    :goto_5
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 225
    invoke-interface {v3, v2}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V

    .line 226
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->consumeContent()V

    .line 227
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 228
    new-instance v0, Lbfc;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lbfc;-><init>([BLjava/lang/String;)V

    .line 236
    :goto_6
    const/4 v1, 0x0

    iput-object v1, p0, Lbfr;->f:Lorg/apache/http/client/methods/HttpRequestBase;
    :try_end_3
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 245
    iput-object v0, p0, Lbfr;->h:Lbfc;

    .line 246
    return-void

    .line 206
    :cond_3
    :try_start_4
    invoke-virtual {v1}, Lorg/apache/http/HttpHost;->toURI()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_3

    move-result-object v0

    goto :goto_3

    :cond_4
    move-object v0, v2

    .line 220
    goto :goto_4

    .line 240
    :catch_2
    move-exception v0

    new-instance v0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw v0

    .line 242
    :catch_3
    move-exception v0

    new-instance v0, Ljava/net/MalformedURLException;

    invoke-direct {v0}, Ljava/net/MalformedURLException;-><init>()V

    throw v0

    :cond_5
    move-object v1, v0

    goto :goto_5

    :cond_6
    move-object v0, v2

    goto :goto_6

    :cond_7
    move-object v3, v0

    goto/16 :goto_2
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 146
    iget-object v1, p0, Lbfr;->i:[Lorg/apache/http/Header;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 147
    invoke-interface {v3}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 148
    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 151
    :goto_1
    return-object v0

    .line 146
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 151
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a()V
    .locals 4

    .prologue
    .line 114
    iget-object v0, p0, Lbfr;->f:Lorg/apache/http/client/methods/HttpRequestBase;

    .line 115
    if-eqz v0, :cond_0

    .line 117
    :try_start_0
    iget-object v1, p0, Lbfr;->j:Lblp;

    const-string v2, "aborting the HTTP request"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a(Landroid/net/Uri;)V
    .locals 2

    .prologue
    .line 87
    iput-object p1, p0, Lbfr;->d:Landroid/net/Uri;

    .line 88
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    iget-object v1, p0, Lbfr;->d:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lbfr;->a(Lorg/apache/http/client/methods/HttpRequestBase;)V

    .line 89
    return-void
.end method

.method public final a(Landroid/net/Uri;Lbfc;)V
    .locals 3

    .prologue
    .line 93
    iput-object p1, p0, Lbfr;->d:Landroid/net/Uri;

    .line 95
    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    iget-object v1, p0, Lbfr;->d:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 96
    if-eqz p2, :cond_0

    .line 97
    new-instance v1, Lorg/apache/http/entity/ByteArrayEntity;

    .line 1085
    iget-object v2, p2, Lbfc;->a:[B

    .line 97
    invoke-direct {v1, v2}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 1092
    iget-object v2, p2, Lbfc;->b:Ljava/lang/String;

    .line 98
    invoke-virtual {v1, v2}, Lorg/apache/http/entity/AbstractHttpEntity;->setContentType(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 102
    :cond_0
    invoke-direct {p0, v0}, Lbfr;->a(Lorg/apache/http/client/methods/HttpRequestBase;)V

    .line 103
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lbfr;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 141
    iget v0, p0, Lbfr;->e:I

    return v0
.end method

.method public final c()Lbfc;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lbfr;->h:Lbfc;

    return-object v0
.end method
