.class final Laau;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1868
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1868
    .line 3871
    new-instance v0, Laat;

    invoke-direct {v0, p1}, Laat;-><init>(Landroid/os/Parcel;)V

    .line 1868
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1868
    .line 2876
    new-array v0, p1, [Laat;

    .line 1868
    return-object v0
.end method