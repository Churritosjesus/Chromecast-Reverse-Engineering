.class final Lqf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lfd;


# instance fields
.field private synthetic a:Lqe;


# direct methods
.method constructor <init>(Lqe;)V
    .locals 0

    .prologue
    .line 663
    iput-object p1, p0, Lqf;->a:Lqe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 666
    iget-object v0, p0, Lqf;->a:Lqe;

    invoke-static {v0}, Lqe;->a(Lqe;)Lqa;

    move-result-object v0

    invoke-virtual {v0}, Lqa;->f()V

    .line 667
    return-void
.end method
