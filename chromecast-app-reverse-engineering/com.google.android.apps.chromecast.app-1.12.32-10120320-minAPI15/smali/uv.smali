.class final Luv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lut;


# direct methods
.method constructor <init>(Lut;)V
    .locals 0

    .prologue
    .line 506
    iput-object p1, p0, Luv;->a:Lut;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 509
    iget-object v0, p0, Luv;->a:Lut;

    iget-object v0, v0, Lut;->h:Lus;

    iget-object v1, p0, Luv;->a:Lut;

    invoke-static {v0, v1}, Lus;->b(Lus;Lut;)V

    .line 510
    return-void
.end method
