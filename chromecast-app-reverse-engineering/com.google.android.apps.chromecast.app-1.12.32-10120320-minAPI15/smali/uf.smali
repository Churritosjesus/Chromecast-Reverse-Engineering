.class final Luf;
.super Ltr;
.source "PG"


# instance fields
.field private synthetic a:Luc;


# direct methods
.method constructor <init>(Luc;)V
    .locals 0

    .prologue
    .line 2271
    iput-object p1, p0, Luf;->a:Luc;

    invoke-direct {p0}, Ltr;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltq;Ltv;)V
    .locals 3

    .prologue
    .line 2275
    iget-object v1, p0, Luf;->a:Luc;

    .line 2903
    invoke-virtual {v1, p1}, Luc;->c(Ltq;)I

    move-result v0

    .line 2904
    if-ltz v0, :cond_0

    .line 2906
    iget-object v2, v1, Luc;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug;

    .line 2907
    invoke-virtual {v1, v0, p2}, Luc;->a(Lug;Ltv;)V

    .line 2276
    :cond_0
    return-void
.end method
