.class public Ltq;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/content/Context;

.field final b:Ltt;

.field final c:Lts;

.field d:Ltr;

.field e:Ltp;

.field f:Z

.field g:Ltv;

.field h:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Ltt;)V
    .locals 2

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Lts;

    .line 1400
    invoke-direct {v0, p0}, Lts;-><init>(Ltq;)V

    .line 63
    iput-object v0, p0, Ltq;->c:Lts;

    .line 83
    if-nez p1, :cond_0

    .line 84
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_0
    iput-object p1, p0, Ltq;->a:Landroid/content/Context;

    .line 91
    iput-object p2, p0, Ltq;->b:Ltt;

    .line 93
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ltu;
    .locals 1

    .prologue
    .line 254
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Ltp;)V
    .locals 2

    .prologue
    .line 148
    invoke-static {}, Ltz;->f()V

    .line 150
    iget-object v0, p0, Ltq;->e:Ltp;

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Ltq;->e:Ltp;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltq;->e:Ltp;

    invoke-virtual {v0, p1}, Ltp;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    :cond_0
    :goto_0
    return-void

    .line 155
    :cond_1
    iput-object p1, p0, Ltq;->e:Ltp;

    .line 156
    iget-boolean v0, p0, Ltq;->f:Z

    if-nez v0, :cond_0

    .line 157
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltq;->f:Z

    .line 158
    iget-object v0, p0, Ltq;->c:Lts;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lts;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method public final a(Ltr;)V
    .locals 0

    .prologue
    .line 122
    invoke-static {}, Ltz;->f()V

    .line 123
    iput-object p1, p0, Ltq;->d:Ltr;

    .line 124
    return-void
.end method

.method public final a(Ltv;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 222
    invoke-static {}, Ltz;->f()V

    .line 224
    iget-object v0, p0, Ltq;->g:Ltv;

    if-eq v0, p1, :cond_0

    .line 225
    iput-object p1, p0, Ltq;->g:Ltv;

    .line 226
    iget-boolean v0, p0, Ltq;->h:Z

    if-nez v0, :cond_0

    .line 227
    iput-boolean v1, p0, Ltq;->h:Z

    .line 228
    iget-object v0, p0, Ltq;->c:Lts;

    invoke-virtual {v0, v1}, Lts;->sendEmptyMessage(I)Z

    .line 231
    :cond_0
    return-void
.end method

.method public b(Ltp;)V
    .locals 0

    .prologue
    .line 191
    return-void
.end method
