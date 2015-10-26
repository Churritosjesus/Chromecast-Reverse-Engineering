.class final Lcw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldf;


# instance fields
.field private synthetic a:Lcu;


# direct methods
.method constructor <init>(Lcu;)V
    .locals 0

    .prologue
    .line 436
    iput-object p1, p0, Lcw;->a:Lcu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 439
    iget-object v0, p0, Lcw;->a:Lcu;

    invoke-virtual {v0}, Lcu;->a()V

    .line 440
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 449
    iget-object v0, p0, Lcw;->a:Lcu;

    invoke-static {p1}, Ldq;->a(Ljava/lang/Object;)Ldq;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcu;->a(Ldq;)V

    .line 451
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 455
    iget-object v0, p0, Lcw;->a:Lcu;

    invoke-static {p1}, Lci;->a(Ljava/lang/Object;)Lci;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcu;->a(Lci;)V

    .line 457
    return-void
.end method
