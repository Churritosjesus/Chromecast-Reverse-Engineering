.class final Lasj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:I

.field private synthetic b:J

.field private synthetic c:Lasp;

.field private synthetic d:Ldbt;

.field private synthetic e:Lash;


# direct methods
.method constructor <init>(Lash;IJLasp;Ldbt;)V
    .locals 1

    .prologue
    .line 339
    iput-object p1, p0, Lasj;->e:Lash;

    iput p2, p0, Lasj;->a:I

    iput-wide p3, p0, Lasj;->b:J

    iput-object p5, p0, Lasj;->c:Lasp;

    iput-object p6, p0, Lasj;->d:Ldbt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 339
    check-cast p1, Ldch;

    .line 1343
    if-eqz p1, :cond_0

    iget-object v0, p1, Ldch;->a:[Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Ldch;->a:[Ljava/lang/String;

    array-length v0, v0

    if-nez v0, :cond_1

    .line 1345
    :cond_0
    iget-object v0, p0, Lasj;->e:Lash;

    iget v1, p0, Lasj;->a:I

    iget-wide v2, p0, Lasj;->b:J

    iget-object v4, p0, Lasj;->c:Lasp;

    invoke-static {v0, v1, v2, v3, v4}, Lash;->a(Lash;IJLasp;)V

    .line 1346
    :goto_0
    return-void

    .line 1350
    :cond_1
    iget-object v0, p0, Lasj;->e:Lash;

    invoke-static {v0}, Lash;->b(Lash;)Latw;

    move-result-object v0

    iget-wide v2, p0, Lasj;->b:J

    invoke-virtual {v0, v2, v3}, Latw;->a(J)V

    .line 1352
    iget v0, p0, Lasj;->a:I

    if-ne v0, v4, :cond_4

    .line 1355
    iget-object v0, p0, Lasj;->e:Lash;

    invoke-static {v0}, Lash;->b(Lash;)Latw;

    move-result-object v0

    new-instance v1, Last;

    iget-object v2, p0, Lasj;->e:Lash;

    .line 1356
    invoke-static {v2}, Lash;->c(Lash;)Ldbt;

    move-result-object v2

    iget-object v3, p0, Lasj;->e:Lash;

    .line 1357
    invoke-static {v3}, Lash;->d(Lash;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Last;-><init>(Ldbt;Ljava/lang/String;)V

    .line 2048
    iget-object v2, v0, Latw;->a:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2053
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v0, Laun;->g:J

    .line 1364
    :cond_2
    :goto_1
    iget-object v0, p0, Lasj;->c:Lasp;

    if-eqz v0, :cond_3

    .line 1365
    iget v0, p0, Lasj;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 1366
    iget-object v0, p0, Lasj;->c:Lasp;

    invoke-interface {v0}, Lasp;->k()V

    .line 1371
    :cond_3
    :goto_2
    iget-object v0, p0, Lasj;->e:Lash;

    invoke-virtual {v0, v4}, Lash;->b(I)V

    .line 1372
    iget-object v0, p0, Lasj;->e:Lash;

    invoke-static {v0}, Lash;->e(Lash;)V

    goto :goto_0

    .line 1360
    :cond_4
    iget-object v0, p0, Lasj;->e:Lash;

    invoke-static {v0}, Lash;->b(Lash;)Latw;

    move-result-object v0

    iget-object v1, p0, Lasj;->d:Ldbt;

    iget-object v1, v1, Ldbt;->a:Ljava/lang/String;

    .line 3053
    iget-object v0, v0, Latw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 3054
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3055
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Last;

    .line 3067
    iget-object v0, v0, Last;->b:Ljava/lang/String;

    .line 3055
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3056
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 1368
    :cond_6
    iget-object v0, p0, Lasj;->c:Lasp;

    invoke-interface {v0}, Lasp;->i()V

    goto :goto_2
.end method
