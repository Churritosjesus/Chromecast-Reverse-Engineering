.class final Lbcq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbcn;


# direct methods
.method constructor <init>(Lbcn;)V
    .locals 0

    .prologue
    .line 238
    iput-object p1, p0, Lbcq;->a:Lbcn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Lbcq;->a:Lbcn;

    invoke-static {v0}, Lbcn;->e(Lbcn;)V

    .line 242
    return-void
.end method
