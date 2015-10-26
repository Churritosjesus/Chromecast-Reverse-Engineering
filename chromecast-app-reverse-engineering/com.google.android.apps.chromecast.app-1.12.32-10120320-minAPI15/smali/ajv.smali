.class public Lajv;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Lajx;

.field public e:Landroid/os/Bundle;

.field private f:Ljava/lang/String;

.field private g:Lafb;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 539
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 525
    const v0, 0x1030010

    iput v0, p0, Lajv;->c:I

    .line 540
    invoke-static {}, Lafb;->a()Lafb;

    move-result-object v0

    iput-object v0, p0, Lajv;->g:Lafb;

    .line 541
    iget-object v0, p0, Lajv;->g:Lafb;

    if-nez v0, :cond_0

    .line 542
    invoke-static {p1}, Laji;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 543
    if-eqz v0, :cond_1

    .line 544
    iput-object v0, p0, Lajv;->b:Ljava/lang/String;

    .line 551
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lajv;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 552
    return-void

    .line 546
    :cond_1
    new-instance v0, Lafq;

    const-string v1, "Attempted to create a builder without a valid access token or a valid default Application ID."

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 563
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 525
    const v0, 0x1030010

    iput v0, p0, Lajv;->c:I

    .line 564
    if-nez p2, :cond_0

    .line 565
    invoke-static {p1}, Laji;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    .line 567
    :cond_0
    const-string v0, "applicationId"

    invoke-static {p2, v0}, Lajp;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    iput-object p2, p0, Lajv;->b:Ljava/lang/String;

    .line 570
    invoke-direct {p0, p1, p3, p4}, Lajv;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 571
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 637
    iput-object p1, p0, Lajv;->a:Landroid/content/Context;

    .line 638
    iput-object p2, p0, Lajv;->f:Ljava/lang/String;

    .line 639
    if-eqz p3, :cond_0

    .line 640
    iput-object p3, p0, Lajv;->e:Landroid/os/Bundle;

    .line 644
    :goto_0
    return-void

    .line 642
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lajv;->e:Landroid/os/Bundle;

    goto :goto_0
.end method


# virtual methods
.method public a()Lajq;
    .locals 6

    .prologue
    .line 602
    iget-object v0, p0, Lajv;->g:Lafb;

    if-eqz v0, :cond_0

    .line 603
    iget-object v0, p0, Lajv;->e:Landroid/os/Bundle;

    const-string v1, "app_id"

    iget-object v2, p0, Lajv;->g:Lafb;

    .line 1236
    iget-object v2, v2, Lafb;->g:Ljava/lang/String;

    .line 603
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    iget-object v0, p0, Lajv;->e:Landroid/os/Bundle;

    const-string v1, "access_token"

    iget-object v2, p0, Lajv;->g:Lafb;

    .line 2172
    iget-object v2, v2, Lafb;->d:Ljava/lang/String;

    .line 606
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 613
    :goto_0
    new-instance v0, Lajq;

    iget-object v1, p0, Lajv;->a:Landroid/content/Context;

    iget-object v2, p0, Lajv;->f:Ljava/lang/String;

    iget-object v3, p0, Lajv;->e:Landroid/os/Bundle;

    iget v4, p0, Lajv;->c:I

    iget-object v5, p0, Lajv;->d:Lajx;

    invoke-direct/range {v0 .. v5}, Lajq;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILajx;)V

    return-object v0

    .line 610
    :cond_0
    iget-object v0, p0, Lajv;->e:Landroid/os/Bundle;

    const-string v1, "app_id"

    iget-object v2, p0, Lajv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
