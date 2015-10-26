.class final Laox;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laow;


# direct methods
.method constructor <init>(Laow;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Laox;->a:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 81
    iget-object v0, p0, Laox;->a:Laow;

    invoke-static {v0}, Laow;->a(Laow;)Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Laox;->a:Laow;

    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 82
    iget-object v0, p0, Laox;->a:Laow;

    invoke-virtual {v0}, Laow;->i()V

    .line 83
    iget-object v0, p0, Laox;->a:Laow;

    invoke-virtual {v0}, Laow;->j()V

    .line 84
    return-void
.end method
