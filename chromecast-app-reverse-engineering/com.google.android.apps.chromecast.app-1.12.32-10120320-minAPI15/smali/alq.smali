.class final Lalq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Laow;

.field private synthetic d:Lalm;


# direct methods
.method constructor <init>(Lalm;Ljava/lang/String;Ljava/lang/String;Laow;)V
    .locals 0

    .prologue
    .line 649
    iput-object p1, p0, Lalq;->d:Lalm;

    iput-object p2, p0, Lalq;->a:Ljava/lang/String;

    iput-object p3, p0, Lalq;->b:Ljava/lang/String;

    iput-object p4, p0, Lalq;->c:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 649
    check-cast p1, Lbex;

    .line 1653
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lalq;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 1654
    iget-object v0, p0, Lalq;->d:Lalm;

    .line 2051
    iget-object v0, v0, Lalm;->l:Ljava/util/Set;

    .line 1654
    iget-object v1, p0, Lalq;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1655
    iget-object v0, p0, Lalq;->c:Laow;

    iget-object v1, p1, Lbex;->a:Ljava/lang/String;

    .line 2618
    iput-object v1, v0, Laow;->q:Ljava/lang/String;

    .line 1656
    iget-object v0, p0, Lalq;->d:Lalm;

    .line 3051
    iget-object v0, v0, Lalm;->f:Ljava/util/List;

    .line 1656
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lalt;

    .line 1657
    iget-object v2, p0, Lalq;->c:Laow;

    invoke-interface {v0, v2}, Lalt;->a(Laow;)V

    goto :goto_0

    .line 649
    :cond_0
    return-void
.end method

.method public final b_(I)V
    .locals 3

    .prologue
    .line 663
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lalq;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 664
    iget-object v0, p0, Lalq;->d:Lalm;

    .line 1051
    iget-object v0, v0, Lalm;->l:Ljava/util/Set;

    .line 664
    iget-object v1, p0, Lalq;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 665
    return-void
.end method
