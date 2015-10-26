.class public final Laul;
.super Latt;
.source "PG"


# instance fields
.field private final n:Lblp;

.field private final o:Laea;

.field private final p:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldca;Ljava/lang/String;IIILaea;Ladz;)V
    .locals 4

    .prologue
    .line 39
    const-string v0, "LoadPreviewRequest"

    const-string v1, "/settings/preview"

    invoke-static {p1, v1}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1065
    new-instance v2, Ldcc;

    invoke-direct {v2}, Ldcc;-><init>()V

    .line 1066
    iput-object p3, v2, Ldcc;->a:Ljava/lang/String;

    .line 1067
    iput-object p4, v2, Ldcc;->b:Ldca;

    .line 1068
    iput-object p5, v2, Ldcc;->c:Ljava/lang/String;

    .line 1069
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Ldcc;->d:Ljava/lang/Integer;

    .line 1070
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Ldcc;->e:Ljava/lang/Integer;

    .line 1071
    invoke-static {p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Ldcc;->f:Ljava/lang/Integer;

    .line 1072
    invoke-static {v2}, Ldcc;->a(Ldew;)[B

    move-result-object v2

    .line 39
    invoke-direct {p0, v0, v1, v2, p10}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 22
    new-instance v0, Lblp;

    const-string v1, "LoadPreviewRequest"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laul;->n:Lblp;

    .line 43
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Lasr;->a(Landroid/content/Context;)Laec;

    move-result-object v0

    .line 1202
    iput-object v0, p0, Lads;->i:Laec;

    .line 44
    iput-object p9, p0, Laul;->o:Laea;

    .line 45
    iput-object p2, p0, Laul;->p:Ljava/lang/String;

    .line 46
    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 8

    .prologue
    .line 19
    check-cast p1, [B

    .line 2051
    iget-object v0, p0, Laul;->o:Laea;

    if-eqz v0, :cond_0

    .line 2052
    const/4 v1, 0x0

    .line 2053
    if-eqz p1, :cond_1

    .line 2055
    :try_start_0
    invoke-static {p1}, Ldcd;->a([B)Ldcd;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 2060
    :goto_0
    iget-object v1, p0, Laul;->o:Laea;

    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V

    .line 19
    :cond_0
    return-void

    .line 2056
    :catch_0
    move-exception v0

    .line 2057
    iget-object v2, p0, Laul;->n:Lblp;

    const-string v3, "LoadPreviewRequest"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "Could not load album preview: "

    invoke-virtual {v0}, Ldev;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    const-string v0, "oauth2:https://www.google.com/accounts/OAuthLogin"

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Laul;->p:Ljava/lang/String;

    return-object v0
.end method
