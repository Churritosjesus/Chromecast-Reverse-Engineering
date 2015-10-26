.class public Ldh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lagf;
.implements Lmo;


# instance fields
.field public final a:Landroid/support/v7/widget/Toolbar;

.field public final b:Landroid/graphics/drawable/Drawable;

.field public final c:Ljava/lang/CharSequence;

.field public volatile d:Ljava/lang/Object;

.field public final e:Ljava/util/concurrent/CountDownLatch;

.field public f:J

.field public g:J


# direct methods
.method constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 8029
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8025
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Ldh;->e:Ljava/util/concurrent/CountDownLatch;

    .line 8026
    iput-wide v2, p0, Ldh;->f:J

    .line 8027
    iput-wide v2, p0, Ldh;->g:J

    .line 8030
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 7300
    invoke-virtual {p0, p1}, Ldh;->b(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public a()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 1648
    iget-object v0, p0, Ldh;->b:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public a(I)V
    .locals 2

    .prologue
    .line 1639
    if-nez p1, :cond_0

    .line 1640
    iget-object v0, p0, Ldh;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Ldh;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->c(Ljava/lang/CharSequence;)V

    .line 1644
    :goto_0
    return-void

    .line 1642
    :cond_0
    iget-object v0, p0, Ldh;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/Toolbar;->b(I)V

    goto :goto_0
.end method

.method public a(Lagp;)V
    .locals 0

    .prologue
    .line 2300
    return-void
.end method

.method public a(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .prologue
    .line 1633
    iget-object v0, p0, Ldh;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/Toolbar;->a(Landroid/graphics/drawable/Drawable;)V

    .line 1634
    invoke-virtual {p0, p2}, Ldh;->a(I)V

    .line 1635
    return-void
.end method

.method public a(Lbxl;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 5000
    const-string v0, "Notifier must not be null"

    invoke-static {p1, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {v1, v0, p1}, Lbxk;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbxk;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public a(Ljava/lang/Object;Ldep;)V
    .locals 0

    .prologue
    .line 7256
    invoke-virtual {p0, p1, p2}, Ldh;->b(Ljava/lang/Object;Ldep;)V

    .line 7258
    return-void
.end method

.method public b(Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 7328
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unknown type 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .prologue
    .line 1653
    iget-object v0, p0, Ldh;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public b(Lbxl;)V
    .locals 1

    .prologue
    .line 7000
    iget-object v0, p0, Ldh;->d:Ljava/lang/Object;

    return-void
.end method

.method public b(Ljava/lang/Object;Ldep;)V
    .locals 3

    .prologue
    .line 7263
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p2, v0}, Ldep;->c(I)V

    .line 7277
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unknown type 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7279
    :catch_0
    move-exception v0

    .line 7281
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 1658
    const/4 v0, 0x1

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 3000
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/util/Set;
    .locals 1

    .prologue
    .line 4000
    const/4 v0, 0x0

    return-object v0
.end method

.method public f()V
    .locals 1

    .prologue
    .line 6000
    const/4 v0, 0x0

    iput-object v0, p0, Ldh;->d:Ljava/lang/Object;

    return-void
.end method

.method public g()V
    .locals 4

    .prologue
    .line 8033
    iget-wide v0, p0, Ldh;->f:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 8034
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Ldh;->f:J

    .line 8035
    return-void
.end method

.method public h()V
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 8038
    iget-wide v0, p0, Ldh;->g:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Ldh;->f:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 8039
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Ldh;->g:J

    .line 8040
    iget-object v0, p0, Ldh;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 8041
    return-void
.end method
