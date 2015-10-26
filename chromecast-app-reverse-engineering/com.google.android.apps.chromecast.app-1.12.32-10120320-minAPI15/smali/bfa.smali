.class final Lbfa;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/Object;

.field private synthetic b:Lbey;


# direct methods
.method constructor <init>(Lbey;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lbfa;->b:Lbey;

    iput-object p2, p0, Lbfa;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 111
    iget-object v0, p0, Lbfa;->b:Lbey;

    .line 1079
    iget-object v0, v0, Lbey;->b:Lbdn;

    .line 111
    iget-object v1, p0, Lbfa;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lbdn;->a(Ljava/lang/Object;)V

    .line 112
    return-void
.end method
