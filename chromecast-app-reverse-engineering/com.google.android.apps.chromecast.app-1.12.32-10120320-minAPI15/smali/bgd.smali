.class public final Lbgd;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ldbp;

.field private synthetic b:Lbgb;


# direct methods
.method public constructor <init>(Lbgb;Ldbp;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lbgd;->b:Lbgb;

    iput-object p2, p0, Lbgd;->a:Ldbp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lbgd;->b:Lbgb;

    invoke-static {v0}, Lbgb;->a(Lbgb;)Lbgg;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lbgd;->b:Lbgb;

    invoke-static {v0}, Lbgb;->a(Lbgb;)Lbgg;

    move-result-object v0

    iget-object v1, p0, Lbgd;->a:Ldbp;

    iget-object v1, v1, Ldbp;->a:[Ldbf;

    invoke-virtual {v0, v1}, Lbgg;->a([Ldbf;)V

    .line 81
    :cond_0
    return-void
.end method
