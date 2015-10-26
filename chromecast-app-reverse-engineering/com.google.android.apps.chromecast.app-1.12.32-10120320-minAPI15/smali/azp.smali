.class final Lazp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lazm;


# direct methods
.method constructor <init>(Lazm;)V
    .locals 0

    .prologue
    .line 445
    iput-object p1, p0, Lazp;->a:Lazm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 449
    iget-object v0, p0, Lazp;->a:Lazm;

    invoke-static {v0}, Lazm;->e(Lazm;)V

    .line 450
    return-void
.end method
