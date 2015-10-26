.class final Lasi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lash;


# direct methods
.method constructor <init>(Lash;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lasi;->a:Lash;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lasi;->a:Lash;

    invoke-static {v0}, Lash;->a(Lash;)V

    .line 97
    return-void
.end method
