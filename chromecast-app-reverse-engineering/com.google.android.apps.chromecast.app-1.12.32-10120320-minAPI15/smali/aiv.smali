.class final Laiv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laiu;


# direct methods
.method constructor <init>(Laiu;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Laiv;->a:Laiu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Laiv;->a:Laiu;

    invoke-static {v0}, Laiu;->a(Laiu;)V

    .line 145
    return-void
.end method
