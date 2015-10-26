.class final Lvb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Luz;


# direct methods
.method constructor <init>(Luz;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lvb;->a:Luz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lvb;->a:Luz;

    invoke-static {v0}, Luz;->a(Luz;)V

    .line 150
    return-void
.end method
