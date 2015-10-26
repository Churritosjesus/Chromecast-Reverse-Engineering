.class public final Lbkh;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static j:Lbkh;


# instance fields
.field a:Lbwj;

.field b:Lbwj;

.field c:Lctn;

.field public d:Lctk;

.field public e:Lbkk;

.field f:Lblp;

.field public final g:Lbke;

.field public final h:Lblv;

.field public i:Lctw;


# direct methods
.method constructor <init>()V
    .locals 3

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Lblp;

    const-string v1, "ChromecastTagManager"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbkh;->f:Lblp;

    .line 62
    new-instance v0, Lbke;

    invoke-direct {v0}, Lbke;-><init>()V

    iput-object v0, p0, Lbkh;->g:Lbke;

    .line 63
    new-instance v0, Lblv;

    invoke-direct {v0}, Lblv;-><init>()V

    iput-object v0, p0, Lbkh;->h:Lblv;

    .line 64
    return-void
.end method

.method public static a()Lbkh;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lbkh;->j:Lbkh;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Lbkh;

    invoke-direct {v0}, Lbkh;-><init>()V

    sput-object v0, Lbkh;->j:Lbkh;

    .line 55
    :cond_0
    sget-object v0, Lbkh;->j:Lbkh;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 6

    .prologue
    .line 90
    .line 1100
    iget-object v0, p0, Lbkh;->a:Lbwj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbkh;->a:Lbwj;

    invoke-interface {v0}, Lbwj;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1105
    :cond_0
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 1106
    invoke-static {v0}, Lcuq;->a(Landroid/content/Context;)Lcuq;

    move-result-object v1

    .line 2000
    iget-object v2, v1, Lcuq;->a:Lctw;

    .line 1107
    iput-object v2, p0, Lbkh;->i:Lctw;

    .line 1113
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c()Lbli;

    move-result-object v2

    invoke-virtual {v2}, Lbli;->b()Ljava/lang/String;

    move-result-object v2

    .line 1122
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c()Lbli;

    move-result-object v0

    .line 2100
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    .line 2104
    iget-object v4, v0, Lbli;->a:Ljava/util/Map;

    invoke-static {v3}, Lblj;->c(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 2105
    iget-object v0, v0, Lbli;->a:Ljava/util/Map;

    invoke-static {v3}, Lblj;->c(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1120
    :goto_0
    invoke-virtual {v1, v2, v0}, Lcuq;->a(Ljava/lang/String;I)Lbwj;

    move-result-object v0

    iput-object v0, p0, Lbkh;->a:Lbwj;

    .line 1126
    const-string v0, "GTM-K5SPV5"

    const/4 v2, -0x1

    .line 1127
    invoke-virtual {v1, v0, v2}, Lcuq;->a(Ljava/lang/String;I)Lbwj;

    move-result-object v0

    iput-object v0, p0, Lbkh;->b:Lbwj;

    .line 1129
    iget-object v0, p0, Lbkh;->a:Lbwj;

    new-instance v1, Lbki;

    invoke-direct {v1, p0}, Lbki;-><init>(Lbkh;)V

    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    .line 1185
    iget-object v0, p0, Lbkh;->b:Lbwj;

    new-instance v1, Lbkj;

    invoke-direct {v1, p0}, Lbkj;-><init>(Lbkh;)V

    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    .line 91
    :cond_1
    return-void

    .line 2106
    :cond_2
    iget-object v4, v0, Lbli;->a:Ljava/util/Map;

    invoke-static {v3}, Lblj;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 2107
    iget-object v0, v0, Lbli;->a:Ljava/util/Map;

    invoke-static {v3}, Lblj;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    .line 2110
    :cond_3
    iget-object v3, v0, Lbli;->a:Ljava/util/Map;

    sget-object v4, Lbli;->b:Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 2111
    iget-object v0, v0, Lbli;->a:Ljava/util/Map;

    sget-object v3, Lbli;->b:Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    .line 2113
    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method
