.class final Lalp;
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
    .line 613
    iput-object p1, p0, Lalp;->d:Lalm;

    iput-object p2, p0, Lalp;->a:Ljava/lang/String;

    iput-object p3, p0, Lalp;->b:Ljava/lang/String;

    iput-object p4, p0, Lalp;->c:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 613
    check-cast p1, Lbdf;

    .line 2617
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lalp;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 2618
    iget-object v0, p0, Lalp;->d:Lalm;

    .line 3051
    iget-object v0, v0, Lalm;->j:Ljava/util/Set;

    .line 2618
    iget-object v1, p0, Lalp;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2619
    iget-object v0, p0, Lalp;->c:Laow;

    invoke-virtual {v0, p1}, Laow;->b(Lbdf;)V

    .line 2620
    iget-object v0, p0, Lalp;->c:Laow;

    invoke-virtual {v0}, Laow;->p()V

    .line 613
    return-void
.end method

.method public final b_(I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 625
    new-array v0, v3, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lalp;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 626
    iget-object v0, p0, Lalp;->d:Lalm;

    .line 1051
    iget-object v0, v0, Lalm;->j:Ljava/util/Set;

    .line 626
    iget-object v1, p0, Lalp;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 627
    iget-object v0, p0, Lalp;->c:Laow;

    .line 1772
    iget-boolean v0, v0, Laow;->d:Z

    .line 627
    if-nez v0, :cond_0

    .line 628
    iget-object v0, p0, Lalp;->c:Laow;

    .line 2609
    iput-boolean v3, v0, Laow;->d:Z

    .line 630
    :cond_0
    iget-object v0, p0, Lalp;->c:Laow;

    invoke-virtual {v0}, Laow;->p()V

    .line 631
    return-void
.end method
