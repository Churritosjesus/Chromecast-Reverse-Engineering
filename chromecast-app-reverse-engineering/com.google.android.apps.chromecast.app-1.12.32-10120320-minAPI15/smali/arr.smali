.class final Larr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Larp;


# direct methods
.method constructor <init>(Larp;)V
    .locals 0

    .prologue
    .line 510
    iput-object p1, p0, Larr;->a:Larp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 510
    check-cast p1, Ldbv;

    .line 1513
    iget-object v0, p0, Larr;->a:Larp;

    invoke-static {v0}, Larp;->b(Larp;)Laqw;

    move-result-object v0

    check-cast v0, Lbca;

    invoke-interface {v0, p1}, Lbca;->a(Ldbv;)V

    .line 510
    return-void
.end method
