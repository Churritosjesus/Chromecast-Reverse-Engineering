.class final Lacp;
.super Landroid/os/AsyncTask;
.source "PG"


# instance fields
.field final synthetic a:Lacb;


# direct methods
.method constructor <init>(Lacb;)V
    .locals 0

    .prologue
    .line 2898
    iput-object p1, p0, Lacp;->a:Lacb;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    .line 2898
    check-cast p1, [Ljava/util/ArrayList;

    .line 3905
    const/4 v0, 0x0

    aget-object v1, p1, v0

    .line 3906
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3907
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lada;

    .line 3908
    if-eqz v0, :cond_0

    .line 3909
    iget-object v4, p0, Lacp;->a:Lacb;

    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v0

    invoke-virtual {v4, v0}, Lacb;->a(Lacx;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 3912
    :cond_1
    iget-object v0, p0, Lacp;->a:Lacb;

    invoke-virtual {v0}, Lacb;->g()Laav;

    move-result-object v0

    .line 3913
    new-instance v3, Lacq;

    invoke-direct {v3, p0, v1}, Lacq;-><init>(Lacp;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v2, v3}, Laav;->a(Ljava/util/ArrayList;Laca;)V

    .line 3942
    const/4 v0, 0x0

    .line 2898
    return-object v0
.end method
