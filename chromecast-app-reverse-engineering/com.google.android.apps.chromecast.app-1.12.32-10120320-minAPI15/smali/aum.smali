.class public final Laum;
.super Latt;
.source "PG"


# instance fields
.field private final n:Lblp;

.field private final o:Laea;

.field private final p:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ldck;Laea;Ladz;)V
    .locals 6

    .prologue
    .line 36
    const-string v0, "SaveDeviceBackdropSettingsRequest"

    const-string v1, "/settings/device"

    invoke-static {p1, v1}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1067
    new-instance v2, Ldbu;

    invoke-direct {v2}, Ldbu;-><init>()V

    .line 1068
    iput-object p2, v2, Ldbu;->a:Ljava/lang/String;

    .line 1069
    iput-object p3, v2, Ldbu;->b:Ldck;

    .line 1071
    invoke-virtual {v2}, Ldbu;->d()I

    move-result v3

    new-array v3, v3, [B

    .line 1075
    const/4 v4, 0x0

    array-length v5, v3

    invoke-static {v3, v4, v5}, Ldep;->a([BII)Ldep;

    move-result-object v4

    .line 1072
    invoke-virtual {v2, v4}, Ldbu;->a(Ldep;)V

    .line 36
    invoke-direct {p0, v0, v1, v3, p5}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 26
    new-instance v0, Lblp;

    const-string v1, "SaveDeviceBackdropSettingsRequest"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laum;->n:Lblp;

    .line 38
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Lasr;->a(Landroid/content/Context;)Laec;

    move-result-object v0

    .line 1202
    iput-object v0, p0, Lads;->i:Laec;

    .line 39
    iput-object p2, p0, Laum;->p:Ljava/lang/String;

    .line 40
    iput-object p4, p0, Laum;->o:Laea;

    .line 41
    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 21
    check-cast p1, [B

    .line 2048
    if-eqz p1, :cond_0

    .line 2050
    :try_start_0
    invoke-static {p1}, Ldbv;->a([B)Ldbv;

    move-result-object v0

    .line 2051
    if-eqz v0, :cond_0

    iget-object v1, v0, Ldbv;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    iget-object v0, v0, Ldbv;->d:Ljava/lang/Integer;

    .line 2052
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 2060
    :cond_0
    :goto_0
    iget-object v0, p0, Laum;->o:Laea;

    if-eqz v0, :cond_1

    .line 2061
    iget-object v0, p0, Laum;->o:Laea;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Laea;->a(Ljava/lang/Object;)V

    .line 21
    :cond_1
    return-void

    .line 2055
    :catch_0
    move-exception v0

    .line 2056
    iget-object v1, p0, Laum;->n:Lblp;

    const-string v2, "Could not save device backdrop settings: "

    invoke-virtual {v0}, Ldev;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    const-string v0, "oauth2:https://www.google.com/accounts/OAuthLogin"

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Laum;->p:Ljava/lang/String;

    return-object v0
.end method
