.class public Laiu;
.super Lajq;
.source "PG"


# static fields
.field private static final f:Ljava/lang/String;


# instance fields
.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Laiu;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Laiu;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1, p2}, Lajq;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 1263
    iput-object p3, p0, Lajq;->a:Ljava/lang/String;

    .line 52
    return-void
.end method

.method static synthetic a(Laiu;)V
    .locals 0

    .prologue
    .line 42
    invoke-super {p0}, Lajq;->cancel()V

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    .prologue
    .line 56
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 57
    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Laji;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 60
    const-string v0, "bridge_args"

    .line 61
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    const-string v2, "bridge_args"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 64
    invoke-static {v0}, Laji;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 67
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 68
    invoke-static {v2}, Laib;->a(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v0

    .line 69
    const-string v2, "com.facebook.platform.protocol.BRIDGE_ARGS"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :cond_0
    :goto_0
    const-string v0, "method_results"

    .line 77
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 78
    const-string v2, "method_results"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 80
    invoke-static {v0}, Laji;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 82
    invoke-static {v0}, Laji;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "{}"

    .line 85
    :cond_1
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 86
    invoke-static {v2}, Laib;->a(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v0

    .line 87
    const-string v2, "com.facebook.platform.protocol.RESULT_ARGS"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 95
    :cond_2
    :goto_1
    const-string v0, "version"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 96
    const-string v0, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    .line 97
    invoke-static {}, Laix;->a()I

    move-result v2

    .line 96
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 99
    return-object v1

    .line 70
    :catch_0
    move-exception v0

    .line 71
    sget-object v2, Laiu;->f:Ljava/lang/String;

    const-string v3, "Unable to parse bridge_args JSON"

    invoke-static {v2, v3, v0}, Laji;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 88
    :catch_1
    move-exception v0

    .line 89
    sget-object v2, Laiu;->f:Ljava/lang/String;

    const-string v3, "Unable to parse bridge_args JSON"

    invoke-static {v2, v3, v0}, Laji;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public cancel()V
    .locals 4

    .prologue
    .line 104
    .line 1284
    iget-object v1, p0, Lajq;->c:Landroid/webkit/WebView;

    .line 2280
    iget-boolean v0, p0, Lajq;->e:Z

    .line 110
    if-eqz v0, :cond_0

    .line 3276
    iget-boolean v0, p0, Lajq;->d:Z

    .line 111
    if-nez v0, :cond_0

    if-eqz v1, :cond_0

    .line 113
    invoke-virtual {v1}, Landroid/webkit/WebView;->isShown()Z

    move-result v0

    if-nez v0, :cond_2

    .line 114
    :cond_0
    invoke-super {p0}, Lajq;->cancel()V

    .line 148
    :cond_1
    :goto_0
    return-void

    .line 119
    :cond_2
    iget-boolean v0, p0, Laiu;->g:Z

    if-nez v0, :cond_1

    .line 123
    const/4 v0, 0x1

    iput-boolean v0, p0, Laiu;->g:Z

    .line 126
    const-string v0, "(function() {  var event = document.createEvent(\'Event\');  event.initEvent(\'fbPlatformDialogMustClose\',true,true);  document.dispatchEvent(event);})();"

    .line 132
    const-string v2, "javascript:"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 136
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 137
    new-instance v1, Laiv;

    invoke-direct {v1, p0}, Laiv;-><init>(Laiu;)V

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 132
    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method
