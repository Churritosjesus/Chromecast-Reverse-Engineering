.class public final Laui;
.super Latt;
.source "PG"


# instance fields
.field private final n:Laea;

.field private final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laea;)V
    .locals 6

    .prologue
    .line 36
    const-string v1, "LoadCardDataRequest"

    .line 1062
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "/gsse?rt=b&hl=%s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {}, Lblj;->c()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-static {p1, v0}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1069
    invoke-static {}, Ldcs;->b()Ldct;

    move-result-object v0

    .line 1070
    invoke-virtual {v0, p3}, Ldct;->b(Ljava/lang/String;)Ldct;

    move-result-object v0

    const-string v3, "E8C28D3C"

    .line 1071
    invoke-virtual {v0, v3}, Ldct;->a(Ljava/lang/String;)Ldct;

    move-result-object v0

    .line 1072
    invoke-virtual {v0}, Ldct;->c()Lddq;

    move-result-object v0

    check-cast v0, Ldcs;

    .line 1073
    invoke-virtual {v0}, Ldcs;->e()[B

    move-result-object v0

    .line 37
    new-instance v3, Lauj;

    invoke-direct {v3}, Lauj;-><init>()V

    .line 36
    invoke-direct {p0, v1, v2, v0, v3}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 47
    iput-object p4, p0, Laui;->n:Laea;

    .line 48
    iput-object p2, p0, Laui;->o:Ljava/lang/String;

    .line 49
    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 25
    check-cast p1, [B

    .line 2055
    :try_start_0
    iget-object v0, p0, Laui;->n:Laea;

    invoke-static {p1}, Ldcu;->a([B)Ldcu;

    move-result-object v1

    invoke-interface {v0, v1}, Laea;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Lddx; {:try_start_0 .. :try_end_0} :catch_0

    .line 2058
    :goto_0
    return-void

    .line 2056
    :catch_0
    move-exception v0

    .line 2057
    const-string v1, "LoadCardDataRequest"

    const-string v2, "Failed to parse sse response proto: "

    invoke-virtual {v0}, Lddx;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Laui;->o:Ljava/lang/String;

    return-object v0
.end method
