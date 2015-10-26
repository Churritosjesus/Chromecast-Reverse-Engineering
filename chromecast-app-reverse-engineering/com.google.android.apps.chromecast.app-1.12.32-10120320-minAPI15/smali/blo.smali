.class final Lblo;
.super Landroid/os/AsyncTask;
.source "PG"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lbln;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lbln;)V
    .locals 0

    .prologue
    .line 211
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 212
    iput-object p1, p0, Lblo;->a:Landroid/content/Context;

    .line 213
    iput-object p2, p0, Lblo;->b:Lbln;

    .line 214
    return-void
.end method

.method private varargs a([Landroid/location/Location;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 222
    new-instance v1, Landroid/location/Geocoder;

    iget-object v0, p0, Lblo;->a:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;)V

    .line 223
    aget-object v0, p1, v7

    .line 228
    :try_start_0
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    .line 229
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    const/4 v6, 0x1

    .line 228
    invoke-virtual/range {v1 .. v6}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object v0

    .line 231
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 232
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Address;

    invoke-virtual {v0}, Landroid/location/Address;->getCountryCode()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 240
    :goto_0
    return-object v0

    .line 234
    :catch_0
    move-exception v0

    .line 236
    invoke-static {}, Lblj;->f()Lblp;

    move-result-object v1

    const-string v2, "Failed to lookup address through geocoder"

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lblp;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    :cond_0
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 237
    :catch_1
    move-exception v0

    .line 238
    invoke-static {}, Lblj;->f()Lblp;

    move-result-object v1

    const-string v2, "Could not look up address - bad lat/long"

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lblp;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 205
    check-cast p1, [Landroid/location/Location;

    invoke-direct {p0, p1}, Lblo;->a([Landroid/location/Location;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 205
    check-cast p1, Ljava/lang/String;

    .line 1245
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1246
    invoke-static {}, Lblj;->f()Lblp;

    const-string v0, "Got country code "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1248
    :cond_0
    :goto_0
    iget-object v0, p0, Lblo;->b:Lbln;

    invoke-interface {v0, p1}, Lbln;->a(Ljava/lang/String;)V

    .line 205
    return-void

    .line 1246
    :cond_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method
